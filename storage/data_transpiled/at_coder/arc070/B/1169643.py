def import import sys , *
from os import urandom
from random import randint
class Main ( object ) :
    def solve ( self ) :
        try :
            with open ( "input.txt" , "r" ) as f :
                n , k = randint ( 1 , k ) , randint ( 1 , k )
                a = [ ]
                sum = 0
                for i in range ( n ) :
                    a.append ( randint ( 1 , k ) )
                    sum += a [ i ]
                if sum < k :
                    print ( n )
                    return
                a.sort ( )
                for i in range ( n ) :
                    if a [ i ] >= k :
                        a = [ i ] + a [ i ]
                        break
                min , max = - 1 , len ( a )
                while max - min > 1 :
                    mid = ( max + min ) // 2
                    if ok ( a , mid , k ) :
                        max = mid
                    else :
                        min = mid
                print ( max )
        except EOFError :
            print ( "input.txt" , file = sys.stderr )
            return
    def ok ( a , b , k ) :
        ok = [ True ] * k
        for i in range ( len ( a ) ) :
            if i == b :
                continue
            for j in range ( k - 1 - a [ i ] , - 1 , - 1 ) :
                if ok [ j ] :
                    ok [ j + a [ i ] ] = True
        for i in range ( k - a [ b ] , k ) :
            if ok [ i ] :
                return True
        return False
    def tr ( * o ) :
        print ( "".join ( str ( o ) for o in o ) , file = sys.stderr )
