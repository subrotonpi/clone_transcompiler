def _import ( ) : return _import ( )
class Solution ( object ) :
    def __init__ ( self ) :
        self.cin = sys.stdin
    def next ( self ) :
        while not self.cin or self.cin.readline ( ).strip ( ) :
            self.cin = sys.stdin.readline ( ).strip ( )
        return self.cin.readline ( ).strip ( )
    def __next__ ( self ) : return int ( next ( ) )
    def main ( self ) :
        L , D , N = [ int ( i ) for i in range ( D ) ]
        dict = [ cin.readline ( ).split ( ) for i in range ( D ) ]
        for i in range ( N ) :
            pat = cin.readline ( ).strip ( )
            st = [ ]
            for j in range ( L ) :
                st.append ( [ ] )
            k = 0
            for j in range ( len ( pat ) ) :
                if pat [ j ] != '(' :
                    st [ k ].append ( pat [ j ] )
                    k += 1
                else :
                    j += 1
                    while pat [ j ] != ')' :
                        st [ k ].append ( pat [ j ] )
                        j += 1
                    k += 1
            ans = 0
            for j in range ( D ) :
                ok = True
                for t in range ( L ) :
                    if dict [ j ] [ t ] not in st :
                        ok = False
                        break
                if ok :
                    ans += 1
            print ( "Case #%d: %d" % ( i + 1 , ans ) )
