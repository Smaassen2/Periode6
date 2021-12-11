import scipy.stats
def readfile():
    # File inlezen
    file = open("ResultsOfMarkersAndAnthocyninConcentration.txt","r")
    reformed_string = ""
    #Om een newline achter de laatste concentratie weg te halen
    line = file.readline().strip()
    # Alle concentraties in een lijst zetten
    concentrationlist = line.split("\t")
    markerlist = []
    tstatisticslist = []
    pvaluelist = []
    for line in file:
        if line != " ":
            lista = []
            listb = []
            index = 0

            line = file.readline().strip()
            bandpresencelist = line.split("\t")
            marker = bandpresencelist[0]
            del bandpresencelist[0]
            for bandpresence in bandpresencelist:
                if bandpresence == "a":
                    lista.append(float(concentrationlist[index].replace(",", ".")))
                elif bandpresence == "b":
                    listb.append(float(concentrationlist[index].replace(",", ".")))
                index += 1

            tstatistic, pvalue = scipy.stats.ttest_ind(listb, lista, equal_var=True)
            if pvalue < 0.1:
                markerlist.append(marker)
                tstatisticslist.append(tstatistic)
                pvaluelist.append(pvalue)

    output = open("Significant.txt", "w")
    index2 = 1
    for marker in markerlist:
        output.write(marker)
        if index2 != len(markerlist):
            output.write(", ")
            index2 += 1
    output.write("\n")
    index2 = 1
    for tstatisticpercentage in tstatisticslist:
        output.write(str(tstatisticpercentage))
        if index2 != len(markerlist):
            output.write(", ")
            index2 += 1
    output.write("\n")
    index2 = 1
    for pvaluepercentage in pvaluelist:
        output.write(str(pvaluepercentage))
        if index2 != len(markerlist):
            output.write(", ")
            index2 += 1
    output.close()


if __name__ == '__main__':
    readfile()

