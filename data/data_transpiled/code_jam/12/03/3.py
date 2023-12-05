def _import ( ) :
    import os
    import sys
    import os
    import subprocess
    import subprocess
    import string
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import sys
    class CodeJam2012_Q_C ( subprocess ) :
        def calc ( A , B ) :
            checked = [ False ] * ( B - A + 1 )
            cnt = 0
            D = len ( str ( A ) )
            unit = 1
            for i in range ( 1 , D ) :
                unit *= 10
            for i in range ( A , B + 1 ) :
                if not checked [ i - A ] :
                    checked [ i - A ] = True
                    group_num = 1
                    cycled = i
                    for j in range ( 1 , D ) :
                        cycled = cycled // 10 + ( cycled % 10 ) * unit
                        if A <= cycled <= B and not checked [ cycled - A ] :
                            group_num += 1
                            checked [ cycled - A ] = True
                cnt += group_num * ( group_num - 1 ) / 2
            return cnt
    try :
        ( subprocess.call ( [ 'C-large.in' , '2012_Q_C-large.out' ] ) )
    except Exception :
        pass
    import subprocess
    in_handle = open ( in_handle , 'r' )
    out_handle = open ( out_handle , 'w' )
    case_nums = 0
    case_nums = int ( in_handle.readline ( ) )
    for i in range ( case_nums ) :
        input = in_handle.readline ( ).split ( )
        A = int ( input [ 0 ] )
        B = int ( input [ 1 ] )
        out_str = calc ( A , B )
        fmt_out_str = 'Case #%d: %s' % ( i + 1 , out_str )
        out_handle.write ( fmt_out_str )
        print ( fmt_out_str )
    print ( '%d cases complete' % ( case_nums ) )
    out_handle.close ( )
