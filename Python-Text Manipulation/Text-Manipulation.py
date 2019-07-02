import csv
def csv_okuyucu(d_obj):

    reader = csv.reader(d_obj)

    for row in reader:

        print(",".join(row))

if __name__ == "__main__":

    csv_path = "random_python_information.csv"

    with open(csv_path, "r") as d_oku:

        csv_okuyucu(d_oku)
