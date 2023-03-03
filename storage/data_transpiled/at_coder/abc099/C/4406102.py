def import import sys , random
import random
import sys
import random
import sys
import sys
import random
class Main ( sys ) :
    def __init__ ( self ) :
        Scanner ( )
        n = random.randint ( 0 , sys.maxint )
        ans = sys.maxint
        s1 , s2 = n // 6 , n // 9
        TS = [ ]
        TN = [ ]
        for i in range ( 0 , n ) :
            temp = i
            while temp // 6 :
                TS.append ( temp % 6 )
                temp /= 6
            TS.append ( temp )
            temp = i
            while temp // 9 :
                TN.append ( temp % 9 )
                temp /= 9
            TN.append ( temp )
        for i in range ( 0 , s1 ) :
            six = 6 * i
            nine = ( n - six ) - ( n - six ) % 9
            if six + nine <= n <= n <= n :
                ans = min ( ans , TS [ six ] + TN [ nine ] + ( n - six - nine ) )
        self.out.write ( ans )
