def main ( * orange ) :
    import re
    import sys
    class D ( object ) :
        def __init__ ( self , * orange ) :
            self.input = sys.stdin
            self.num_cases = len ( orange )
            for n , P in enumerate ( orange ) :
                nums = [ random.randint ( 0 , len ( orange ) ) for i in range ( P ) ]
                if len ( orange ) % 2 :
                    return
                self.chop [ num ] = orange [ n ]
            else :
                if len ( orange ) % 2 :
                    return
                self.chop [ num ] = orange [ n ]
        def chop ( self , num ) :
            self.nums = [ random.randint ( 0 , len ( orange ) ) for i in range ( P ) ]
            freqs = [ random.randint ( 0 , len ( orange ) ) for i in range ( P ) ]
            num_freqs = defaultdict ( int )
            for i in range ( P ) :
                num_freqs [ nums [ i ] ] += freqs [ i ]
            diffs = [ ]
            solve ( num_freqs , diffs )
            print ( "Case #%d:" % ( n + 1 ) , end = ' ' )
            for num in diffs :
                print ( " " + str ( num ) , end = ' ' )
            print ( )
    def solve ( num_freqs , diffs ) :
        if len ( num_freqs ) == 1 and None in num_freqs and num_freqs [ None ] == 1 :
            return True
        for diff in num_freqs :
            chopped = chop ( num_freqs , diff )
            if chopped :
                diffs.append ( diff )
                if solve ( chopped , diffs ) :
                    return True
                del diffs [ - 1 ]
        return False
    def chop ( num_freqs , diff ) :
        copy = defaultdict ( list )
        chop = defaultdict ( list )
        while len ( copy ) > 0 :
            num = copy.firstkey ( )
            if diff > 0 :
                if num + diff not in copy or copy [ num + diff ] < 0 :
                    return False
                copy [ num ] = copy [ num ]
            else :
                if num + diff in range ( 1 , len ( nums ) ) :
                    return