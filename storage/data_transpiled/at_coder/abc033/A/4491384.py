def main ( ) :
    import sys
    from os import path
    from os import environ
    pw = environ [ 'PW_PASS' ]
    pass = pw.split ( '' )
    ans = ''
    if pass [ 0 ] == pass [ 1 ] and pass [ 1 ] == pass [ 2 ] and pass [ 2 ] == pass [ 3 ] :
        ans = 'SAME'
    else :
        ans = 'DIFFERENT'
    print ( ans )
