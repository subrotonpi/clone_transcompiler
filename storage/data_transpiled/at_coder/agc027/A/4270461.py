def import import _number
class Main ( object ) :
    def __init__ ( self ) :
        sc = _number
        self.n = sc.n
        num = sc.num
        ar = [ ]
        for i in range ( n ) :
            ar.append ( sc.next ( ) )
        ar.sort ( )
        for i in range ( 1 , n ) :
            ar [ i ] += ar [ i - 1 ]
        if ar [ n - 1 ] == num :
            print ( n )
        else :
            ans = - 1
            for i in range ( n ) :
                if ar [ i ] <= num :
                    ans = i
            print ( ans if ans < num else ans + 1 )
