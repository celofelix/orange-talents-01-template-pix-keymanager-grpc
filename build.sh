rm -vf orange-talents-01-template-pix-keymanager-grpc.zip
zip -r orange-talents-01-template-pix-keymanager-grpc.zip *
aws s3 cp orange-talents-01-template-pix-keymanager-grpc.zip s3://pix-grpc/