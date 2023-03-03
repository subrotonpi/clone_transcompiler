def main ( ) :
    import re
    from sys import argv
    sc = open ( argv [ 1 ] )
    input = sc.read ( )
    sc.close ( )
    inputs = re.split ( '[+]' , input )
    ct = 0
    for i in inputs :
        if '0' not in i :
            ct += 1
    print ( ct )
