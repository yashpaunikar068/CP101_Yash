def isnthAdditive(n):
    if (isPrime(n)):
        if (isPrime(sumOfDigits(n))):
            return True
    else:
        return False
    
def isPrime(k):
    if (k < 2):
        return False
    if (k ==2):
        return True
    if (k % 2 == 0):
        return False
    maxFactor = round(k**0.5)
    for i in range(3, maxFactor+1, 2):
        if (k % i == 0):
            return False
    return True

def sumOfDigits(l):
    sum = 0
    while (l>0):
        sum += l % 10
        l = l//10
    return sum     

def nthAdditivePrime(x):
    found = 0
    guess = 0
    while (found <= x):
        guess += 1
        if (isnthAdditive(guess)):
            found += 1
    return guess       

print(nthAdditivePrime(int(input())))
