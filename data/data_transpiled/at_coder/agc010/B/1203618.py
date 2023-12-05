def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
    def __call__ ( self , * args ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( self.n )
        sum = 0
        for i in a :
            sum += i
        nn = n
        consume = nn * ( nn + 1 ) / 2
        if sum % consume != 0 :
            print ( "NO" )
            return
        sump = sum / consume
        cnt = 0
        isok = True
        for i in range ( n ) :
            chil = ( a [ ( i - 1 + n ) % n ] + sump - a [ i ] )
            if chil < 0 or chil % n != 0 :
                isok = False
            p = chil / n
            if a [ ( i - 1 + n ) % n ] + ( sump - p ) != a [ i ] + ( n - 1 ) * p :
                isok = False
            if p < 0 :
                isok = False
            cnt += p
        if isok and sump == cnt :
            print ( "YES" )
        else :
            print ( "NO" )
        return
