def _import ( ) :
    from os import system , getfile
    from os.path import join
    from os import rename , getfile
    from os import rename , getfile
    from os import rename , getfile
    from os import getcwd , getfile
    from os.path import join , dirname , getfile
    from os import rename
    from os import getcwd , getfile
    from os.path import join , getfile
    from os import getcwd
    from os.path import join , getfile
    from os import getcwd
    from os import chdir , getfile
    from os.path import join , getfile
    from os import chdir
    MAX = 1000000000
    if sys.version_info [ 0 ] >= 3 :
        n = getfile ( join ( dirname ( abspath ( __file__ ) ) , 'r' ) )
        a = [ ]
        for i in range ( n - 1 ) :
            a.append ( getfile ( join ( dirname ( abspath ( __file__ ) ) , 'r' ) ) )
        ans = [ ]
        ans.append ( MAX )
        try :
            solve ( 0 , n - 1 , 0 , MAX )
            for i in range ( n ) :
                print ( '' , ans [ i ] , end = '' )
            print ( )
        except :
            print ( ' Impossible' , end = '' )
    def solve ( from_s , to_s , slope , h ) :
        if from_s == to_s :
            return
        i = from_s
        while i < to_s :
            ans.append ( h - slope * ( to_s - i ) )
            if a [ i ] > to_s :
                raise
            solve ( i + 1 , a [ i ] , slope + 1 , h - slope * ( to_s - a [ i ] ) )
            i = a [ i ]
    def main ( ) :
        locale.setlocale ( locale.LC_ALL , '' )
        if len ( sys.argv ) >= 2 :
            input_filename = sys.argv [ 1 ]
            output_filename = sys.argv [ 2 ]
        f = open ( input_filename , 'r' )
        f.write ( '\n' )
        f.close ( )
        print ( 'Case #%d:' % t , end = '' )
    main ( )