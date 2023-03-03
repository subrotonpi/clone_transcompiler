def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        values = [ ]
        for i in range ( 5 ) :
            values.append ( sc.__next__ ( ) )
        values = sorted ( values )
        index = 0
        for value in values :
            index += 1
            if index == ( len ( values ) - 2 ) :
                print ( value )
