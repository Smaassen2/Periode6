def readfile():
    file = open("Sorted_Normalised_Table_2.tsv","r")
    reformed_string = ""
    x = 1
    for line in file:
        splitted_line = line.split("\t")
        if splitted_line[6] != "NA":
            if splitted_line[1].startswith("__"):
                #or int(splitted_line[5]) > 0.1:
                None
            else:
                reformed_string += line
                x += 1
                print(x)
    output = open("Results.txt", "w")
    output.write(reformed_string)
    output.close()
    print(reformed_string)

if __name__ == '__main__':
    readfile()