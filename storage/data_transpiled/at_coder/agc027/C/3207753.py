def _import ( ) : return sys.stdin.read ( 1024 )
import io
import array
import six
import six
import six
import six
import six
import six
import six
import six.moves
import six.moves
class Main ( six.moves.urllib.FancyURLDecoder ) :
    def __init__ ( self ) :
        six.moves.urllib.FancyURLDecoder.__init__ ( self )
    def read ( self ) :
        sc = six.moves.urllib.FancyURLDecoder.__init__ ( self )
        N = ord ( self.read )
        M = ord ( self.read )
        data = sc.read ( )
        col = [ ]
        for i in range ( N ) :
            col.append ( data [ i ] - ord ( 'A' ) )
        g = [ ]
        for i in range ( N ) :
            g.append ( [ ] )
        deg = [ ]
        for i in range ( M ) :
            a = ord ( self.read ) - 1
            b = ord ( self.read ) - 1
            g [ a ].append ( b )
            g [ b ].append ( a )
            deg [ a ] [ col [ b ] ] += 1
        dq = [ ]
        for i in range ( N ) :
            if deg [ i ] [ 0 ] == 0 or deg [ i ] [ 1 ] == 0 :
                dq.append ( i )
        delete = [ False ]
        while not dq.empty ( ) :
            cur = dq.pop ( )
            if cur in delete : continue
            delete.append ( True )
            del cur
            for dst in g [ cur ] :
                del deg [ dst ] [ col [ cur ] ]
                if deg [ dst ] [ 1 ] == 0 or deg [ dst ] [ 0 ] == 0 :
                    dq.append ( dst )
        print ( "Yes" if N > 0 else "No" )
