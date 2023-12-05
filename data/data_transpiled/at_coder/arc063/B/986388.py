def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.T = sys.maxint
    A = np.array ( [ ] , dtype = np.int32 )
    min = np.array ( [ A [ 0 ] ] , dtype = np.int32 )
    max = np.array ( [ ] , dtype = np.int32 )
    max = np.array ( [ ] , dtype = np.int32 )
    max [ N - 1 ] = A [ N - 1 ]
    for i in range ( N - 2 , - 1 , - 1 ) :
        if A [ i ] > max [ i + 1 ] :
            max [ i ] , min [ i ] = A [ i ] , A [ i + 1 ]
        else :
            max [ i ] , min [ i ] = A [ i + 1 ] , A [ i ]
    maxgap = 0
    for i in range ( N ) :
        if maxgap < max [ i ] - min [ i ] :
            maxgap = max [ i ] - min [ i ]
    prevmax = None
    prevmin = None
    count = 0
    for i in range ( N ) :
        if max [ i ] - min [ i ] == maxgap and ( prevmax != max [ i ] or prevmin != min [ i ] ) :
            count += 1
        prevmax = max [ i ]
        prevmin = min [ i ]
    print ( count )
