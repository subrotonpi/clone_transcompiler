def import import sys
import string
import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sys.stdout = sys.__stdout__
        sys.stdout = sys.__stdout__
        sys.stdout = sys.__stdout__
        sys.stdout = sys.__stdout__
    def readline ( self ) :
        return self.readline ( ).split ( )
    def decode ( self ) :
        return string.decode ( self.decode ( 'utf-8' ) )
    def decode ( self ) :
        return string.decode ( self.decode ( 'utf-8' ) )
    n = int ( n )
    l = int ( n )
    lst = [ int ( x ) for x in re.split ( '\s+' , self.decode ( 'utf-8' ) ) ]
    index = - 1
    for i in range ( n - 1 ) :
        if lst [ i ] + lst [ i + 1 ] >= l :
            index = i
            break
    if index < 0 :
        print ( 'Impossible' )
    else :
        print ( 'Possible' )
        for i in range ( index ) :
            print ( i + 1 )
        for i in range ( n - 1 , index , - 1 ) :
            print ( i )
