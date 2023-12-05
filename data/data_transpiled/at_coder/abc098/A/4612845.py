def main ( ) :
    import sys
    stdin_stream = sys.stdin
    a = stdin_stream.read ( )
    b = stdin_stream.read ( )
    buf = - 10000
    if buf < a + b :
        buf = a + b
    if buf < a - b :
        buf = a - b
    if buf < a * b :
        buf = a * b
    print ( buf )
