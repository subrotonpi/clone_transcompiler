def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.s = self.s
        self.num = 1 << self.n
    hm = { }
    for i in range ( self.num ) :
        bin = '%%%s' % ( n , bin ).replace ( '' , '0' )
        left = [ ]
        lc , rc = 0 , n - 1
        for j in range ( self.n ) :
            if bin [ j ] == '0' :
                left.append ( s [ j ] )
                lc += 1
            else :
                left.append ( s [ j ] )
                rc -= 1
        sleft = ''.join ( left ) + lc
        if hm.get ( sleft ) :
            hm [ sleft ] = int ( hm [ sleft ] ) + 1
        else :
            hm [ sleft ] = 1
    ans = 0
    for i in range ( self.num ) :
        bin = '%%%s' % ( n , bin ).replace ( '' , '0' )
        right = [ ]
        lc , rc = 0 , n - 1
        for j in range ( self.n ) :
            if bin [ j ] == '0' :
                right.append ( s [ 2 * self.n - j - 1 ] )
                lc += 1
            else :
                right.append ( s [ 2 * self.n - j - 1 ] )
                rc -= 1
        sright = ''.join ( right ) + lc
        if hm.get ( sright ) :
            ans += int ( hm [ sright ] )
    print ( ans )
Note :./ Main.py.uses.unchecked or unsafe.operations.Note : Recompile SPACETOKEN with - Xlint : unchecked SPACETOKEN details.
