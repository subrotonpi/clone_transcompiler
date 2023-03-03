def import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.mod_p = 1000000007
        self.inf = 1 << 61
        self.x4 = [ - 1 , 0 , 0 , 1 ]
        self.y4 = [ 0 , - 1 , 1 , 0 ]
        self.x8 = [ - 1 , - 1 , 0 , 1 , 1 , 1 , 0 , - 1 ]
        self.y8 = [ 0 , - 1 , - 1 , - 1 , 0 , 1 , 1 , 1 ]
    def main ( self ) :
        with open ( self.mod_p , "r" ) as f :
            l = len ( f.readlines ( ) )
    W = [ ]
    for i in range ( l ) :
        W.append ( f.read ( ) )
    stack = [ W [ 0 ] ]
    stack_num = 1
    for w in W [ 1 : ] :
        min_stack_weight_diff = sys.maxint
        min_stack_weight_diff_index = - 1
        for j in range ( stack_num ) :
            jw = stack [ j ]
            weight_diff = abs ( jw - w )
            if w <= jw and min_stack_weight_diff >= weight_diff :
                min_stack_weight_diff = weight_diff
                min_stack_weight_diff_index = j
        if min_stack_weight_diff_index != - 1 :
            stack.append ( w )
        else :
            stack.append ( w )
            stack_num += 1
    print ( stack_num )
def printArray2D ( map ) :
    for i in range ( map.shape [ 0 ] ) :
        for j in range ( map.shape [ 1 ] ) :
            print ( "%c\t" % map [ i ] [ j ] , end = '' )
        print ( "\n" , end = '' )
