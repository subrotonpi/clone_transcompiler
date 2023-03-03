def import _readline
import readline
import readline
import readline
import sys
import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.sc = MyScanner ( )
        n = sc.next ( )
        for i in range ( 11 ) :
            for j in range ( 2 ) :
                [ memo [ i ] [ j ] ] = - 1
        print ( dp ( n , 0 , 1 , 0 ) )
    def dp ( n , k , f , acc ) :
        if len ( n ) == k :
            return acc
        if memo [ k ] [ f ] [ acc ] != - 1 :
            return memo [ k ] [ f ] [ acc ]
        if f == 0 :
            sum = 0
            for i in range ( 0 , 9 ) :
                if i == 1 :
                    sum += dp ( n , k + 1 , 0 , acc + 1 )
                else :
                    sum += dp ( n , k + 1 , 0 , acc )
            return memo [ k ] [ 0 ] [ acc ] = sum
        else :
            sum = 0
            for i in range ( 0 , 9 ) :
                if i < len ( n ) :
                    if i == 1 :
                        sum += dp ( n , k + 1 , 0 , acc + 1 )
                    else :
                        sum += dp ( n , k + 1 , 0 , acc )
                elif i == len ( n ) :
                    if i == 1 :
                        sum += dp ( n , k + 1 , 1 , acc + 1 )
                    else :
                        sum += dp ( n , k + 1 , 1 , acc )
            return memo [ k ] [ 1 ] [ acc ] = sum
