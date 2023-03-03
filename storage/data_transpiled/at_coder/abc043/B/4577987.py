def main ( ) :
    import sys
    from string import printable
    sc = sys.stdin
    s = sc.read ( )
    ans = [ ]
    index = 0
    for c in s :
        if c == 'B' :
            if index > 0 :
                index -= 1
        else :
            ans.append ( c )
    for c in ans :
        sys.stdout.write ( c )
