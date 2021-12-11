import scipy.stats


def getdata():
    sig_markerlist = []
    sig_tstatlist = []
    sig_pvaluelist = []
    notsig_markerlist = []
    notsig_tstatlist = []
    notsig_pvaluelist = []

    file = open("ResultsOfMarkersAndAnthocyninConcentration.txt", "r")
    line = file.readline().strip()
    concentrationlist = line.split("\t")
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
                    lista.append(float(concentrationlist[index].replace
                                       (",", ".")))
                elif bandpresence == "b":
                    listb.append(float(concentrationlist[index].replace
                                       (",", ".")))
                index += 1

            tstatistic, pvalue = scipy.stats.ttest_ind(listb, lista,
                                                       equal_var=True)
            tstatistic = str(tstatistic)
            tstatistic = tstatistic.replace(".", ",")
            if pvalue <= 0.05:
                pvalue = str(pvalue)
                pvalue = pvalue.replace(".", ",")
                sig_markerlist.append(marker)
                sig_tstatlist.append(tstatistic)
                sig_pvaluelist.append(pvalue)
            else:
                pvalue = str(pvalue)
                pvalue = pvalue.replace(".", ",")
                notsig_markerlist.append(marker)
                notsig_tstatlist.append(tstatistic)
                notsig_pvaluelist.append(pvalue)

    return sig_markerlist, sig_tstatlist, sig_pvaluelist, \
        notsig_markerlist, notsig_tstatlist, notsig_pvaluelist


def writefile(sig_markerlist, sig_tstatlist, sig_pvaluelist,
              notsig_markerlist, notsig_tstatlist, notsig_pvaluelist):
    output = open("Results.txt", "w")
    index2 = 0
    index3 = 0
    output.write("Marker" + "\t" + "p-value" + "\t" + "t-statistic" +
                 "\n")
    for marker in sig_markerlist:
        output.write(marker + "\t" + sig_pvaluelist[index2] + "\t" +
                     str(sig_tstatlist[index2]) + "\n")
        index2 += 1
    output.write("\n")
    for marker in notsig_markerlist:
        output.write(marker + "\t" + notsig_pvaluelist[index3] + "\t" +
                     str(notsig_tstatlist[index3]) + "\n")
        index3 += 1
    output.close()


if __name__ == '__main__':
    sig_markerlist, sig_tstatlist, sig_pvaluelist, notsig_markerlist, \
        notsig_tstatlist, notsig_pvaluelist = getdata()
    writefile(sig_markerlist, sig_tstatlist, sig_pvaluelist,
              notsig_markerlist, notsig_tstatlist, notsig_pvaluelist)
