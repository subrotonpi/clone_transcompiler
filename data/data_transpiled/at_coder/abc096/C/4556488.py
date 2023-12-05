def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        scn = _main ( args )
        H , W = scn.split ( ' ' )
        map = [ ]
        ans = True
        scn.readline ( )
        for i in range ( H ) :
            map.append ( scn.readline ( ).decode ( 'utf-8' ) )
        for i in range ( H ) :
            if not ans :
                break
            for j in range ( W ) :
                ans &= _check ( i , j )
        print ( 'Yes' if ans else 'No' )
    def check ( self , h , w ) :
        if map [ self.h ] [ w ] == '#' :
            ans = False
            if h != 0 :
                ans |= map [ self.h - 1 ] [ w ] == '#'
            if h != self.H - 1 :
                ans |= map [ self.h + 1 ] [ w ] == '#'
            if w != 0 :
                ans |= map [ self.h ] [ w - 1 ] == '#'
            if w != self.W - 1 :
                ans |= map [ self.h ] [ w + 1 ] == '#'
            return ans
        else :
            return True
