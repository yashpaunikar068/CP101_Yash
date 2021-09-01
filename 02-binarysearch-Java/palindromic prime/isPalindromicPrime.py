def isPalindrome(k):
    if (isPrime(k)):
        n = k
        rev = 0
        while(k != 0):
            rem = k % 10
            rev = rev * 10 + rem
            k = k // 10
        if (rev == n):
            return True
        else:
            return False    
    else:
        return False
        
def isPrime(k):
    if (k < 2):
        return False
    if (k ==2):
        return True
    if (k % 2 == 0):
        return False
    maxFactor = int(k**0.5)
    for i in range(3, maxFactor+1, 2):
        if (k % i == 0):
            return False
    return True
    
def isPalindromicPrime(x):
    if(isPrime(x) and isPalindrome(x)):
        return True
    else:
        return False   
print(isPalindromicPrime(int(input())))