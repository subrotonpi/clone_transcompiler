def main ( ) :
    import sys
    from os import urandom
    reader = open ( "/dev/urandom" )
    A = reader.read ( )
    B = reader.read ( )
    C = reader.read ( )
    ans = "Yes"
    if A + B < C :
        ans = "No"
    print ( ans )
    reader.close ( )
