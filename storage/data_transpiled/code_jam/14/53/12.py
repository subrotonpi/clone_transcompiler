def _ ( ) : return random.choice ( [ 'E' , 'CRIME TIME' ] )
def main ( ) :
    num_tests = randint ( 1 , n )
    for test in range ( 1 , num_tests + 1 ) :
        n = randint ( 1 , n )
        enter = [ ]
        id = [ ]
        for i in range ( n ) :
            enter.append ( next ( ) == 'E' )
            id.append ( randint ( 1 , n ) )
        if ans >= 1000 :
            ans = - 1
        return ans
    def readline ( ) :
        while not next ( ) :
            rl = readline ( )
            if not rl :
                return None
            rl = next ( )
        return next ( )
    def readline ( ) :
        return readline ( )
    def readline ( ) :
        return readline ( )
    N = 2000
    def solve ( ) :
        col = [ ]
        col.append ( - 1 )
        k = 0
        for x in id :
            if x >= 0 and col [ x ] < 0 :
                col [ x ] = k
                k += 1
        for i in range ( n ) :
            if id [ i ] >= 0 :
                id [ i ] = col [ id [ i ] ]
        possible = [ [ ] for _ in range ( n + 1 ) ]
        for mask in range ( 1 , n ) :
            for inside in range ( int ( mask ) , n ) :
                possible [ inside ] [ mask ] = True
        for step in range ( n ) :
            npossible = [ ]
            for mask in range ( 1 , n ) :
                for inside in range ( int ( mask ) , n ) :
                    if not possible [ inside ] [ mask ] :
                        continue
                    if id [ step ] < 0 :
                        if enter [ step ] and inside < n :
                            npossible [ inside + 1 ] [ mask ] = True
                    if not enter [ step ] and inside > 0 :
                        npossible [ inside - 1 ] [ mask ] = True
        return npossible
    return readline
