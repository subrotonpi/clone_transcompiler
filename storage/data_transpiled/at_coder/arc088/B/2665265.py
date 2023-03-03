def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        s = sc.read ( )
        s = s.replace ( '' , '' )
        ans = len ( s )
        index = 0
        while 1 :
            if s [ index ] == '0' :
                next = s.find ( '1' , index + 1 )
            else :
                next = s.find ( '0' , index + 1 )
            if next == - 1 :
                break
            ans = min ( ans , max ( next , s [ index ] - next ) )
            index = next
        print ( ans )
    def main ( ) :
        sc = _main ( )
        return sc
