def import import string , iterable , set_set_empty , raw_input
class Main ( object ) :
    def __init__ ( self ) :
        sc = raw_input ( )
        s = sc.__next__ ( )
        s = s.split ( '' )
        list_a = [ x for x in s if x not in list_a ]
        list_b = sorted ( set ( list_a ) )
        if len ( list_a ) == len ( list_b ) :
            print ( 'yes' )
        else :
            print ( 'no' )
