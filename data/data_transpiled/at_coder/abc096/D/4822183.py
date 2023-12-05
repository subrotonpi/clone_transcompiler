def main ( ) :
    import sys
    from os.path import isfile
    reader = open ( '/proc/stdin' , 'r' )
    N = reader.read ( )
    next = 11
    ans = ""
    while N > 0 and next <= 55555 :
        if isPrime ( next ) :
            ans += str ( next ) + " "
            N -= 1
        next += 10
    print ( ans [ : - 1 ] , end = ' ' )
    reader.close ( )
    def isPrime ( num ) :
        result = True
        for i in range ( 2 , num ) :
            if num % i == 0 :
                result = False
        return result
    return isPrime
