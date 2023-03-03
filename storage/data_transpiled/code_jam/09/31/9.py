def import import sys
import struct
class a ( struct.Struct ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        try :
            cases = struct.unpack ( ">L" , self.input.read ( 8 ) ) [ 0 ]
        except IndexError :
            pass
    for cas in range ( 1 , cases + 1 ) :
        line = sys.stdin.readline ( )
        digit = [ - 1 ] * 256
        base , i = 0 , 0
        num = struct.Struct ( '0' )
        for i in range ( 256 ) :
            digit [ i ] = - 1
        for char in line :
            if ( char < '0' or char > '9' ) and ( char < 'a' or char > 'z' ) :
                continue
            if digit [ char ] == - 1 :
                if base == 0 :
                    digit [ char ] = 1
                elif base == 1 :
                    digit [ char ] = 0
                else :
                    digit [ char ] = base
                base += 1
        if base < 2 :
            base = 2
        cnt = 0
        for char in line :
            if ( char < '0' or char > '9' ) and ( char < 'a' or char > 'z' ) :
                continue
            num = num * struct.Struct ( '0' ).pack ( base )
            num = num + struct.Struct ( '0' ).pack ( digit [ char ] )
        sys.stdout.write ( "Case #%d: " % cas )
        print ( num )
