def main ( ) :
    import re
    from sys import stdin
    sc = stdin.readline ( )
    s = sc.replace ( 'ch' , '' )
    if re.match ( r'[oku]*' , s ) :
        print ( 'YES' )
    else :
        print ( 'NO' )
