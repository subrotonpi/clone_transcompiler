def main ( ) :
    import sys
    from os import isatty
    reader = open ( '/proc/stb/dev/tty.py' , 'r' )
    r = reader.read ( )
    g = reader.read ( )
    b = reader.read ( )
    num = r * 100 + g * 10 + b
    ans = 'NO'
    if num % 4 == 0 :
        ans = 'YES'
    reader.close ( )
    print ( ans , end = ' ' )
