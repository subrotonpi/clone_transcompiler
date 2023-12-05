def import import _sys , string
class Main ( object ) :
    def __init__ ( self ) :
        s = string
    def main ( ) :
        d , j = [ ] , [ ]
        sum = 0
        for i in range ( 7 ) :
            d.append ( s.choice ( string.ascii_lowercase ) )
        for i in range ( 7 ) :
            j.append ( s.choice ( string.ascii_lowercase ) )
        for i in range ( 7 ) :
            sum += max ( d [ i ] , j [ i ] )
        print ( sum )
