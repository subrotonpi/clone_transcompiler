def import import string , * , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , re_parse , ) :
    digit = [ ]
    d = { }
    reverse_dict = { }
    for i in range ( 10 ) :
        digit.append ( i )
        d [ i ] = digit [ i ]
        reverse_dict [ digit [ i ] ] = i
    n = re_parse ( '' )
    value_string = [ ]
    for i in range ( n ) :
        next = re_parse ( '' )
        res = ""
        for char in next :
            res += unichr ( ord ( reverse_dict [ char ] ) - ord ( char ) + ord ( '0' ) )
        value_string.append ( int ( res ) )
    value_string.sort ( key = lambda o : o [ 1 ] )
    for i in range ( n ) :
        next = ''.join ( value_string )
        res = ""
        for char in next :
            res += unichr ( ord ( d [ char ] ) - ord ( char ) + ord ( '0' ) )
        print ( res )
