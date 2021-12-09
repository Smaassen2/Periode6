import scipy.stats
def readfile():
    # File inlezen
    file = open("ResultsOfMarkersAndAnthocyninConcentration.txt","r")
    reformed_string = ""
    #Om een newline achter de laatste concentratie weg te halen
    line = file.readline().strip()
    # Alle concentraties in een lijst zetten
    concentrationlist = line.split("\t")
    tstatisticslist = []
    pvaluelist = []
    for line in file:
        if line != " ":
            lista = []
            listb = []
            index = 0

            line = file.readline().strip()
            bandpresencelist = line.split("\t")
            del bandpresencelist[0]
            for bandpresence in bandpresencelist:
                if bandpresence == "a":
                    lista.append(float(concentrationlist[index].replace(",", ".")))
                elif bandpresence == "b":
                    listb.append(float(concentrationlist[index].replace(",", ".")))
                index += 1
            tstatistic, pvalue = scipy.stats.ttest_ind(lista, listb, equal_var=True)
            tstatisticslist.append(tstatistic)
            pvaluelist.append(pvalue)


    output = open("Results1.txt", "w")
    for (tstatisticpercentage) in tstatisticslist:
        output.write(str(tstatisticslist[int(tstatisticpercentage)]))
        output.write(", ")
    output.write("\n")
    for pvaluepercentage in pvaluelist:
        output.write(str(pvaluelist[int(pvaluepercentage)]))
        output.write(", ")
    output.close()


            # output.write("\n" + "\n")
            # for concentration in listb:
            #     output.write(concentration)
            # output.write("\n" + "\n" + "\n")


if __name__ == '__main__':
    readfile()

