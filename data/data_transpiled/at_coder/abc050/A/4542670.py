def main ( arg ) :
    import sys
    from operator import add
    from sys import argv
    a = argv.pop ( 0 )
    op = argv.pop ( 0 )
    b = argv.pop ( 0 )
    if op == '+' :
        sys.stdout.write ( a + b )
    elif op == '-' :
        sys.stdout.write ( a - b )
