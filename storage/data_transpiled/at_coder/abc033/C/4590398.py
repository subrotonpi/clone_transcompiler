def main ( ) :
    import re
    from sys import argv
    sc = open ( argv [ 1 ] )
    s = sc.read ( )
    S = re.split ( '[+]' , s )
    ans = 0
    for i in S :
        if '0' in i : ans += 1
    print ( ans )
