def RimWorld_nutrition():
    print("Insira a nutrição base:")
    nutri_base = Read_float(input())

    print("Insira a colheita base:")
    colheita_base = Read_float(input())

    print("Insira o tempo de crescimento:")
    tempo_crescimento = Read_float(input())

    print("Insira o número de dias:")
    n_dias = Read_float(input())

    nutri_total = ((n_dias / tempo_crescimento) * colheita_base) * nutri_base

    print("A nutrição é em:\n")
    print(n_dias,"dias :", nutri_total,"\n")
    print(n_dias*2, "dias :", nutri_total*2, "\n",)
    print(n_dias*3, "dias :", nutri_total*3, "\n",)
    print(n_dias*4, "dias :", nutri_total*4, "\n",)

def Read_float(prompt):
    prompt = prompt.replace(',', '.')
    return float(prompt)

RimWorld_nutrition()

#Humpshroom = 1,8
#Arroz = 2,94
#Batata = 8,316
#Morango = 1,8
#Nutrifungo = 9,625