def _import ( ) : return sys.stdin.read ( 2048 )
def isPrint ( ch ) : return ch >= '~'
def nextByte ( ) : return - 1
def isPrint ( ch ) : return ch <= '~'
def nextByte ( ) : return ch
def isPrint ( ch ) : return ch <= '~'
def nextByte ( ) : return ch
def nextByte ( ) : return ch
def isPrint ( ch ) : return ch
def nextByte ( ) : return ch
def nextByte ( ) : return ch
def nextByte ( ) : return ch
def primes ( ) :
    ret = [ ]
    for i in range ( 2 , n + 1 ) :
        isPrime = True
        for j in range ( 2 , i * i + 1 ) :
            if i % j == 0 :
                isPrime = False
                break
        if isPrime :
            ret.append ( i )
    return ret
def solve ( ) :
    N = nextInt ( )
    primes = getPrimes ( 1000 )
    memo = [ 0 ] * 1000 + 1
    for i in range ( 2 , N + 1 ) :
        tmp = i
        for p in primes :
            while tmp > 0 and tmp % p == 0 :
                tmp /= p
                memo [ p ] += 1
    dp = [ [ 1 ] * 10000 + 1 ]
    dp [ 2 ] [ 0 ] = 1
    for i in range ( 2 , 1000 + 1 ) :
        for j in range ( 0 , memo [ i ] ) :
            if j + 1 <= memo [ i ] :
                dp [ i ] [ j + 1 ] += dp [ i ] [ j ]
                dp [ i ] [ j + 1 ] %= MOD
            dp [ i ] [ 0 ] += dp [ i ] [ j ]
            dp [ i ] [ 0 ] %= MOD
    out.write ( dp [ 1001 ] [ 0 ] )
def main ( ) :
    out.flush ( )
    return Main ( ).solve ( )
    out.close ( )
