def _import ( ) :
    import os
    import os
    import locale
    import os
    import sys
    import os.path
    import sys
    import os.path
    import string
    import string
    import string
    import os.path
    import tokenize
    import tokenize
    def readline ( stream ) :
        if not string or string.isspace ( ) :
            return string
        return string
    def max_match ( L , R , adj ) :
        if not string or string.isspace ( ) :
            return 0
        return string.split ( string.strip ( ) ) [ 0 ]
    def readline ( stream ) :
        if not string.isspace ( ) :
            raise InputError ( )
        return string
    def main ( ) :
        import re
        regex = r'C-(small|large).*[.]in'
        directory = os.path.dirname ( __file__ )
        candidates = os.listdir ( directory )
        to_run = None
        for candidate in candidates :
            if not to_run or os.path.getmtime ( candidate ) > os.path.getmtime ( to_run ) :
                to_run = candidate
        input_file = open ( to_run , 'r' )
        output_file = file ( output_file , 'w' )
        solver = TaskC ( )
        test_count = int ( input_file.readline ( ) )
        for i in range ( 1 , test_count + 1 ) :
            solver.solve ( i , input_file , output_file )
        output_file.close ( )
    def task_c ( test_number , infile , outfile ) :
        n = infile.readline ( )
        L = [ ]
        R = [ ]
        adj = [ ]
        for a , b in infile :
            x = add ( L , a )
            y = add ( R , b )
            while len ( adj ) < len ( L ) :
                adj.append ( [ ] )
            adj [ x ].append ( y )
        return 0
    return task_c
