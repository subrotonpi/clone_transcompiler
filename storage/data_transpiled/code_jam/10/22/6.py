def import _io , _float , _float , _collections , _int , _float , _unicode
class B :
    def solve ( self ) :
        N , K , B , T = _int ( self.n )
        x = _int ( x )
        v = _int ( v )
        p = [ ]
        pos = 0
        for i in range ( N ) :
            p.append ( x [ i ] + T * v [ i ] )
            if p [ i ] >= B :
                pos += 1
        if pos < K :
            return 'IMPOSSIBLE'
        cnt = 0
        for i in range ( K ) :
            for j in range ( N - i - 1 , - 1 , - 1 ) :
                if p [ j ] >= B :
                    swap ( p , N - i - 1 , j )
                    cnt += N - i - 1 - j
                    break
        return cnt
    def swap ( p , i , j ) :
        t = p [ i ]
        p [ i ] = p [ j ]
        p [ j ] = t
    global infile
    infile = 'input.txt'
    infile = 'B-small-attempt0.in'
    infile = 'B-large.in'
    with _io.open ( infile , 'r' , encoding = 'utf-8' ) as f :
        fw = _io.open ( 'output.txt' , 'w' , encoding = 'utf-8' )
        N = _int ( f.read ( ) )
        f.write ( '\n' )
        for cas in range ( 1 , N + 1 ) :
            fw.write ( 'Case #%d: ' % cas )
            res = _eval ( f.read ( ) )
            if isinstance ( res , float ) :
                fw.write ( '%.10f\n' % res )
            else :
                fw.write ( '%s\n' % res )
            fw.flush ( )
        fw.close ( )
