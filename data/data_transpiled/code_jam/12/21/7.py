def _ ( ) : return
import locale
import sys
import random
import sys
import os
import sys
class A ( locale.Locale ) :
    def __init__ ( self ) :
        self.n = randint ( 0 , n )
        self.scores = [ ]
        self.sum = 0
        for i in range ( n ) :
            self.scores.append ( randint ( 0 , n ) )
            self.sum += self.scores [ i ]
        for i in range ( n ) :
            lo , hi = 0 , 1
            for it in range ( 500 ) :
                mid = ( lo + hi ) / 2.
                value = self.scores [ i ] + mid * self.sum
                left = 1 - mid
                for j in range ( n ) :
                    if i == j or self.scores [ j ] >= value :
                        continue
                    to_reach = ( value - self.scores [ j ] ) / self.sum
                    left -= to_reach
                if left < 0 :
                    hi = mid
                else :
                    lo = mid
            self.out.write ( "%.15f " % ( 100.* ( lo + hi ) / 2.) )
        self.out.write ( "\n" )
    def run ( self ) :
        try :
            tc = randint ( 0 , n )
            for it in range ( 1 , tc + 1 ) :
                sys.stderr.write ( it )
                self.out.write ( "Case #%d: " % it )
                self.solve ( )
        except :
            NOO ( )
        finally :
            self.out.close ( )
    global out
    out = open ( "input.txt" , "r" )
    St = [ ]
    def NOO ( self ) :
        sys.exit ( 42 )
    randint ( 0 , n )
    randint ( 0 , n )
    randint ( 0 , n )
    randint ( 0 , n )
    uniform ( 0 , n )
    uniform ( 0 , n )
    uniform ( 0 , n )
    uniform ( 0 , n )
    print ( "uniform sample" )
    print ( "\n" )
