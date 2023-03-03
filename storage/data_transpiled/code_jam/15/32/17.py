def _import ( * args ) :
    from itertools import repeat
    import random
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.t = repeat ( self.sc )
            for i in range ( self.t ) :
                print ( 'Case #%d: %.7f' % ( self.i + 1 , self.testcase ( self.sc ) ) )
        def testcase ( self ) :
            k , l , s , keyboard , text = next ( self.sc )
            perm = [ ]
            perm.append ( 0 )
            max_occurences = 0
            sum = 0.0
            denominator = 0
            while True :
                yield keyboard [ perm [ i ] ]
                result = ''.join ( result )
                how_many = 0
                for i in range ( s - l + 1 ) :
                    if result [ i : i + l ] == text :
                        how_many += 1
                max_occurences = max ( max_occurences , how_many )
                sum += how_many
                denominator += 1
                if next_permutation ( perm , k ) :
                    return max_occurences - ( sum / denominator )
    def next_permutation ( perm , k ) :
        i = 0
        while i < len ( perm ) and perm [ i ] == k - 1 :
            perm [ i ] = 0
            i += 1
        if i == len ( perm ) :
            return False
        perm [ i ] += 1
        return True
    B.testcase ( * args )
