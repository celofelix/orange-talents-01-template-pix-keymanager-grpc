rm -vf pix-keymanager-grpc.zip
zip -r pix-keymanager-grpc.zip *
aws s3 pix-keymanager-grpc.zip s3://pix-grpc/