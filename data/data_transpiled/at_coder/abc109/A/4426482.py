def main ( ) :
    import sys
    from sys import stdin
    reader = stdin.readline ( )
    A = reader.next ( )
    B = reader.next ( )
    if A % 2 == 0 or B % 2 == 0 :
        print ( "No" , end = ' ' )
    else :
        print ( "Yes" , end = ' ' )
