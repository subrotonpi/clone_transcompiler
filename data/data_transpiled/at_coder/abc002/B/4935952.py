def main ( ) :
    import re
    from sys import stdin
    sc = stdin.read ( )
    print ( re.sub ( r'[aiueo]' , '' , sc ) )
