def _import ( ) :
    from itertools import chain
    from itertools import chain
    from os import getcwd
    from os.path import expanduser
    from os.path import join
    from os import getcwd
    from os.path import join
    from os.path import join
    def solve ( ) :
        [ x for x in chain ( [ x ] , x ) if not x.startswith ( '_' ) ]
        ans = 0
        s = [ x for x in chain ( [ x ] , x ) if x.startswith ( '_' ) ]
        while not s :
            ans += 1
            x = s [ - 1 ]
            del s [ - 1 ]
            i = - 1
            while i + 1 < len ( s ) and x + s [ i + 1 ] <= cap :
                i += 1
            if i >= 0 :
                del s [ i ]
        return '%d' % ans
    def _import ( ) :
        n = len ( sys.stdin )
        cap = len ( sys.stdin )
        s = [ x for x in range ( n ) if x.startswith ( '_' ) ]
    def _file_name ( ) :
        return re.sub ( '_.*' , '' , basename ( sys.stdin ).lower ( ) )
    def _open ( ) :
        if len ( sys.stdin ) >= 2 :
            input_filename = sys.stdin [ 0 ]
            output_filename = sys.stdout [ 1 ]
        with open ( input_filename , 'r' ) as in_file , open ( output_filename , 'w' ) as out_file :
            tests = len ( sys.stdin )
            in_file.readline ( )
            from itertools import chain
            outputs = [ ]
            for t , _ in enumerate ( chain ( zip ( * chain ( * [ case.solve ( ) for case in s ] ) ) ) ) :
                outputs.append ( loop.create_task ( _open ( t + 1 , 'r' ) ) )
        return outputs
    return _open
