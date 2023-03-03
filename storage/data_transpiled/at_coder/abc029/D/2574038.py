def import readline
import readline
import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        sc = readline.readline ( )
        cs = sc.split ( ) [ 1 ].split ( )
        self.solve ( )
    def solve ( self ) :
        ndigits = [ ord ( c ) for c in cs ]
        dp = [ [ 0 , 0 , 0 ] for c in ndigits ]
        for i in range ( len ( ndigits ) ) :
            for j in range ( 2 ) :
                for k in range ( 10 ) :
                    limit = 9 if j > 0 else ndigits [ i ]
                    for l in range ( 0 , limit ) :
                        jnum = j
                        if l < limit :
                            jnum = 1
                        knum = k + ( l == 1 and 1 or 0 )
                        if dp [ i ] [ j ] [ k ] == 0 :
                            continue
                        dp [ i + 1 ] [ jnum ] [ knum ] += dp [ i ] [ j ] [ k ]
        count = 0
        for j in range ( 2 ) :
            for k in range ( 1 , 10 ) :
                count = count + dp [ len ( ndigits ) ] [ j ] [ k ] * k
        print ( count )
    def pow ( x , n ) :
        ans = 1
        while n > 0 :
            if n & 1 == 1 :
                ans = ans * x
            x = x ** n
            n >>= 1
        return ans
