def command_min ( str1 , str2 , n , command ) :
    import string
    import sys
    from os import path
    str_list = [ 'A' , 'B' , 'X' , 'Y' ]
    str2list = [ ]
    for i in range ( 4 ) :
        for j in range ( 4 ) :
            str_tmp = str_list [ i ] + str_list [ j ]
            str2list.append ( str_tmp )
    with open ( path.join ( path.join ( path.dirname ( __file__ ) , command ) ) ) as f :
        n = int ( f.read ( ) )
        command = f.read ( )
        f.close ( )
        min = n
        for i in range ( 16 ) :
            for j in range ( i + 1 , 16 ) :
                str1 = str2list [ i ]
                str2 = str2list [ j ]
                new_min = command_min ( str1 , str2 , n , command )
                if new_min < min :
                    min = new_min
        print ( min )
    def command_min ( str1 , str2 , n , command ) :
        i = 0
        m = n
        while True :
            if i > n - 2 :
                break
            com_str1 = str ( command [ i ] )
            com_str2 = str ( command [ i + 1 ] )
            str_tmp = com_str1 + com_str2
            if str_tmp == str1 or str_tmp.lower ( ) == str2.lower ( ) :
                m -= 1
                i += 2
            else :
                i += 1
        return m
