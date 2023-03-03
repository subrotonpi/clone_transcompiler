def world2015.round2 ( ) :
    import os
    import sys
    import os
    import json
    import json
    class Bilingual ( object ) :
        def solve_for_small ( self , N , sentences ) :
            words = defaultdict ( list )
            for i , sentence in enumerate ( sentences ) :
                tokens = sentence.split ( )
                for word in tokens :
                    status = words.get ( word )
                    if not status :
                        status = { }
                    status [ word ] |= 1 << i
                    words [ word ] = status
            min = - 1
            for s in ( 1 << ( N - 2 ) ) :
                ss = ( s << 2 ) | 2
                num = solve ( words , ss )
                if not min or num < min :
                    min = num
            return min
        def solve ( words , s ) :
            cnt = 0
            for status in words.values ( ) :
                if status & s and ( status & ~ s ) :
                    cnt += 1
            return cnt
        def main ( args ) :
            input_path = 'file/world2015/round2/C-small-attempt1.in'
            output_path = os.path.splitext ( input_path ) [ 0 ] + '.out'
            f = open ( input_path , 'r' )
            f.write ( '\n'.join ( [ 'Case #{}: {}'.format ( i + 1 , res ) for i , res in enumerate ( sentences ) ] ) )
            f.close ( )
            print ( '\n'.join ( [ ' '.join ( [ str ( i ) for i in i ] ) for i in range ( len ( sentences ) ) ] ) )
