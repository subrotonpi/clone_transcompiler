def main ( ) :
    import sys
    import string
    import string
    import struct
    class Main ( object ) :
        def __init__ ( self ) :
            self.data = string.split ( string.punctuation )
        def __str__ ( self ) :
            return string.split ( self.data ) [ 0 ]
    data = sys.stdin.read ( )
    cnt = [ 0 ] * 26
    for char in data :
        cnt [ char - 'a' ] += 1
    diff = 0
    for char in cnt :
        if char :
            diff += 1
    if diff == 2 :
        print ( 'Second' )
    else :
        if data [ 0 ] == data [ - 1 ] :
            str1 = ( 'Second' if ( len ( data ) - 3 ) & 1 == 0 else 'First' )
            print ( str1 )
        else :
            str1 = ( 'Second' if ( len ( data ) - 2 ) & 1 == 0 else 'First' )
            print ( str1 )
