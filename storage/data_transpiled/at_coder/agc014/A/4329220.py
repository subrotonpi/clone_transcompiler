def import import sys , math , out
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        a , b , c = random.randint ( 1 , 3 ) , random.randint ( 1 , 3 ) , random.randint ( 1 , 3 )
        if ( a + b + c ) % 2 == 1 :
            out.write ( 0 )
        elif a == b and b == c and c == a :
            out.write ( - 1 )
        else :
            ans = 0
            while a % 2 + b % 2 + c % 2 == 0 :
                ans += 1
                tempA = ( b + c ) / 2
                tempB = ( a + c ) / 2
                tempC = ( b + a ) / 2
                a = tempA
                b = tempB
                c = tempC
            out.write ( ans )
