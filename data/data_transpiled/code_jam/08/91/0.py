def _ _ init _ _ ( ) : return 0
import sys
import random
import sys
class ProblemA :
    def __init__ ( self ) :
        self.s = [ 0 ] * 20000
    def add ( self , pos ) :
        while pos < 20000 :
            self.s [ pos ] += 1
            pos = ( pos | ( pos - 1 ) ) + 1
    def getSum ( self , pos ) :
        sum = 0
        while pos > 0 :
            sum += self.s [ pos ]
            pos &= pos - 1
        return sum
    def doMain ( self ) :
        with open ( "input.txt" , "r" ) as f :
            self.doMain ( )
    def doMain ( self ) :
        with open ( "output.txt" , "w" ) as f :
            self.doMain ( )
    def doMain ( self ) :
        with open ( "input.txt" , "w" ) as f :
            self.doMain ( )
    def doMain ( self ) :
        with open ( "output.txt" , "w" ) as f :
            self.doMain ( )
    def doMain ( self ) :
        with open ( "input.txt" , "w" ) as f :
            self.doMain ( )
    def doMain ( self ) :
        with open ( "input.txt" , "w" ) as f :
            self.doMain ( )
    def doMain ( self ) :
        with open ( "input.txt" , "w" ) as f :
            self.doMain ( )
    def doMain ( self ) :
        with open ( "output.txt" , "w" ) as f :
            self.doMain ( )
