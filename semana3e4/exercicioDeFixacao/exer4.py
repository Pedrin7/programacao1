grauA = float(input("Informe a nota do grau a: "))
grauB = float(input("Informe a nota do grau b: "))
notaFinal = 0

if(grauA < 0 or grauB <0):
    print("Erro.")
else:
    grauA = grauA * 0.3
    grauB = grauB * 0.7
    
    notaFinal = grauA + grauB

    if(notaFinal < 6):
        print("Será necessário fazer o Grau C, sua nota é: ",notaFinal)
    else: 
        print("Parabéns, você foi aprovado! Sua nota final foi: ",notaFinal)